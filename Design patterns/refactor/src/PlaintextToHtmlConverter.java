

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {
    String source;
    List<String> result=new ArrayList<>();
    List<String> convertedLine=new ArrayList<>();
    String characterToConvert;

    public String toHtml(readFile read) throws Exception {
        String htmlLines = basicHtmlEncode(read.returnText());
        return htmlLines;
    }

    private String basicHtmlEncode(String source) {
        this.source = source;
        convertLines();
        addANewLine();
        String finalResult = String.join("<br />", result);
        return finalResult;
    }
    private void convertLines(){
        int index=0;
        do {
            characterToConvert = String.valueOf(source.charAt(index));
            index++;
            switch (characterToConvert) {
                case "<":
                    convertedLine.add("&lt;");
                    break;
                case ">":
                    convertedLine.add("&gt;");
                    break;
                case "&":
                    convertedLine.add("&amp;");
                    break;
                case "\n":
                    addANewLine();
                    break;
                default:
                    convertedLine.add(characterToConvert);
            }
        }while(index <= this.source.length());
    }

    private void addANewLine() {
        String line = String.join("", convertedLine);
        result.add(line);
        convertedLine = new ArrayList<>();
    }
}
class readFile{
    String sourceFile;
    public readFile(String sourceFile){
        this.sourceFile=sourceFile;
    }

    protected String returnText() throws IOException {
        return new String(Files.readAllBytes(Paths.get(sourceFile)));
    }
}
//fixed long class smell(single responsibility principle), extract method, inappropriate method name