public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    Slytherin(String inName, String inSurname, int inMagic,
              int inTransgression, int cunning, int determination,
              int ambition, int resourcefulness, int lustForPower) {
        super(inName, inSurname, inMagic, inTransgression);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int summChar(){
        return cunning+determination+ambition+resourcefulness+lustForPower;
    }

    String compareChar(Slytherin obj){
        String answ;

        if (this.summChar() == obj.summChar()){
            answ = this.name+" "+this.surname+" и " + obj.name+" "+obj.surname +
                    " равные Слизеринцы.";
        }
        else if (this.summChar() > obj.summChar()){
            answ = this.name+" "+this.surname+" лучший Слизеринец, чем "+
                    obj.name+" "+obj.surname;
        }
        else {
            answ = obj.name+" "+obj.surname+" лучший Слизеринец, чем "+
                    this.name+" "+this.surname;
        }

        return answ;
    }

    @Override
    public String toString() {
        return name + " " + surname + '\n' +
                "Слизерин\n" +
                "Хитрость = " + cunning + "\n" +
                "Решительность = " + determination + "\n" +
                "Амбициозность =" + ambition + "\n" +
                "Находчивость =" + resourcefulness + "\n" +
                "Жажда власти =" + lustForPower + "\n" +
                "Мощность колдовства = " + magic + "\n" +
                "Трансгрессия = " + transgression;
    }
}
