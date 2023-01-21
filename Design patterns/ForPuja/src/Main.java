import java.util.সরস্বতীপূজা;
import java.util.IIT;
public class IIT
{

    public static void main(String[] args)
    {
        if(java.time.LocalDate.now() == মাঘ মাসের শুক্লা পঞ্চমী তিথি)
        {
            Puja puja=new SaraswatiPuja("Year: 2023");
        }
}

class SaraswatiPuja{
    public SaraswatiPuja(String Year){
        System.out.println("Saraswati Puja celebration at Jagannath Hall begins!");
        System.out.println(" সরস্বতী মহাভাগে বিদ্যেকমললোচনে,
                বিশ্বরূপে বিশালাক্ষী বিদ্যাং দেহি নমস্ত‌ুতে।
                জয় জয় দেবী চরাচর সারে,
                কুচযুগশোভিত মুকতাহারে।
                বীণারঞ্জিত পুস্তক হস্তে,
                ভগবতী ভারতী দেবী নমহস্তুতে।
                নমঃভদ্রকাল্যৈ নমো নিত্যং সরস্বত্যৈ নমো নমঃ।
                বেদ-বেদাঙ্গ-বেদান্ত-বিদ্যা-স্থানেভ্য এব চ।।
                এস স-চন্দন পুষ্পবিল্ব পত্রাঞ্জলি সরস্বতৈ নমঃ।।");
    }
}
