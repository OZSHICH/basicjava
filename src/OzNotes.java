////public class OzNotes {
////todo set to treeset with new Comparator


////todo בשביל להשוות בין לבין ולסדר רצף
//private Set<Client> clients=new TreeSet<>(new Comparator<Client>(){
//@Override
//public int compare(Client c1,Client c2){
//        if(c1.getAccount().getBalance()>c2.getAccount().getBalance()){
//        return 1;
//        }else if(c1.getAccount().getBalance()<c2.getAccount().getBalance()){
//        return-1;
//        }else if(c1.getId()>c2.getId()){
//        return 1;
//        }else if(c1.getId()<c2.getId()){
//        return-1;
//        }
//        return 0;
//        });
//


//todo implements Comparable כדי לייצר השוואה, לעשות
//public class Person implements Comparable

//todo להשוות בין נתונים כדי לקבל סדר עולה

//    @Override
//    public int compareTo(Person p) {
//        return this.getBirthday().getMonthValue() - p.getBirthday().getMonthValue();
//    }
//TODO להשוות מקורי
//@Override
//public int compareTo(Person p) {
//        return 0;
//        }

//todo להדפיס השוואה

//public void printAll() {
//        List<Person> peopleList = new ArrayList<>(people);
//        Collections.sort(peopleList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if (o1.getBirthday().isEqual(o2.getBirthday())) {
//                    return 1;
//                }
//                return o1.compareTo(o2);
//                ////return o1.getBirthday().compareTo(o2.getBirthday());
//            }
//        });
//        for (Person person : peopleList) {
//            System.out.println(person);
//        }
//    }


//        //todo מספר רנדומלי,בין קטן לגדול
//        int או d
//public static int ranNumber(int min,int max){
//        return(int)(Math.random()*(max-min+1))+min;
//        }
//public static double ranNumber(double min,double max){
//        return(double)(Math.random()*(max-min+1))+min;
//        }
////todo age random number,min/max
//private double age=FactoryUtils.ranNumber(16,120);
////TODO random random
//private static Random random=new Random();
//
////TODO random name
//public static String randomHumanName(){
//        String[]hnames={"Jonny","Gal","Moshe","Ravid","Tal"};
//        return hnames[random.nextInt(5)];
//        }
//
////TODO random wight
//public static float randomWeight(){
//        return(float)(Math.random()*5.6f)+3.2f;
//
//        }
////TODO random is-----20% no 80% yes
//public static boolean randomisvaccinated(){
//        return random.nextInt(11)+1>2;
//        }
//
//private static int count=1;
////todo id autoincrement
//private int id=count;
////todo name autoincrement
//private String name="Clint "+count++;
//
//
////todo אתחול מערך Xxxx דוגמאות משתנה לפי מה שמבוקש\או ריק
//public static Xxxx initXxxx(){
//        return new Xxxx("Student "+XxxxCount++,6);
//        }
//public static Client initRegClient(){
//        return new RegularClient(5,initAccount());
//        }
//
//public static Client initVipClient(){
//        return new VipClient(10,initAccount());
//        }
//
//public static Account initAccount(){
//        Account a1=new Account();
//        a1.setBalance((int)(Math.random()*5000));
//        return a1;
//        }
//
//        //todo initialize an instance of xxx class in run\test.
//        BankSystem bank=new BankSystem();
//
//
//// תאריך רנדומלי לפי ישראל
//public static String BeautifyDate(LocalDate date){
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        return formatter.format(date);
//        }
//public static LocalDate getLocalDate(){
//
//        return LocalDate.of(ranNumber(1960,2010),ranNumber(1,12),ranNumber(1,28));
//        }
////TODO constractor to arr
//public Group(){
//        this.people=new Person[10];
//        }
//
////TODO copy constractor
//public Dog(Dog ohter){
//        this.name=ohter.name;
//        this.weight=ohter.weight;
//        this.color=ohter.color;
//        this.isVaccinated=ohter.isVaccinated;
//        }
////TODO full year next day to full year
//public Date next(){
//        LocalDate date=LocalDate.of(this.year,this.month,this.day).plusDays(1); //תאריך של היום
//        return new Date(date.getDayOfMonth(),date.getMonthValue(),date.getYear());
//        }
////TODO get full year start
//public static Date[]init(int year){
//        Date[]dates=new Date[366];
//        Date start=new Date(1,1,year);
//        for(int i=0;i<dates.length;i++){
//        dates[i]=start;
//        //TODO full year next day
//        start=start.next();
//        }
//
//        return dates;
//        }
//
//        //TODO print full year
//        FullYear fullYear=new FullYear(2003);
//
//        BeautifyPrint.print(fullYear);
//
//        }
////TODO set arr names
//private static String[]citis={"tlv","hfa","jlm"};
//
////TODO set id +number
//public static Person intPerson(boolean isSmoking){
//        int id=countPerson;
//        String firstName="John "+id;
//        String lastName="Bryce "+id;
//        //TODO check random name
//        String city=citis[(int)(Math.random()*3)];
//        return new Person(id,lastName,firstName,city,isSmoking);
//        }
/////todo אתחול כלב
//public static Dog initdog(){
//        Dog d1=new Dog();
//        d1.setName(randomDogName());
//        d1.setWeight(randomWeight());
//        d1.setColor(randomColor());
//        d1.setVaccinated(randomisvaccinated());
//
//        return d1;
//        }
//
////TODO new random arr
//public static Dog[]initdogs(int len){
//        Dog[]dogs=new Dog[len];
//        for(int i=0;i<dogs.length;i++){
//        dogs[i]=initdog();
//
//        }
//        return dogs;
//        }
//
//public static DogWalker initDogWalker(String name){
//        DogWalker d1=new DogWalker();
//        d1.setName(name);
//        d1.setDogs(initdogs(5));
//
//        return d1;
//        }
//
//public static DogWalker[]initDogWalkers(int len){
//        DogWalker[]dogWalkers=new DogWalker[len];
//        for(int i=0;i<dogWalkers.length;i++){
//        dogWalkers[i]=initDogWalker(randomHumanName());
//        }
//        return dogWalkers;
//
//        }
//
//public static DogGarden initDogGarden(){
//        DogGarden d1=new DogGarden();
//        d1.setName(randomGardenName());
//        d1.setDogWalker(initDogWalkers(25));
//
//        return d1;
//        }
////TODO מחזיר מיקום אחרון ברשימה
//public static Client getRichestClient(List<Person> clients){
//        return(Client)(clients.get(clients.size()-1));
//        }
////TODO מחזיר מיקום ראשון ברשימה
//public static Client getPoorestClient(List<Person> clients){
//        return(Client)(clients.get(0));
//        }