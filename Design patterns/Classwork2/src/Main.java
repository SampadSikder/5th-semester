import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Document document=new Document();
        document.readDocument();

        ArrayList<IModes> modes=new ArrayList<IModes>();

        IModes tonerSaveMode=new TonerSaveMode(2);
        tonerSaveMode.doMode();
        modes.add(tonerSaveMode);

        IModes boosterMode=new BoosterMode(5,2);
        boosterMode.doMode();
        modes.add(boosterMode);

        IModes pageSaveMode=new PageSaveMode(5,2);
        pageSaveMode.doMode();
        modes.add(pageSaveMode);

        PrintRequest printRequest=new PrintRequest(document,modes);
    }
}