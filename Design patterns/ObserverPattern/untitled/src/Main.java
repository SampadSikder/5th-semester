public class Main {
    public static void main(String[] args) {

        ConcreteSubject subject=new ConcreteSubject("observe.txt", ".");
        SubjectAdd subjectAdd=new SubjectAdd("observe.txt", ".");
        SubjectDelete subjectDelete=new SubjectDelete("observe.txt", ".");

        ConcreteObserver observer1=new ConcreteObserver("1");
        ConcreteObserver observer2=new ConcreteObserver("2");

        subject.attach(observer1);
        subject.attach(observer2);

        subjectAdd.attach(observer1);
        subjectAdd.attach(observer2);

        subjectDelete.attach(observer1);
        subjectDelete.attach(observer2);

        try{
            subject.getUpdate();
            subjectAdd.getUpdate();
            subjectDelete.getUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}