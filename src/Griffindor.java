public class Griffindor extends Hogwarts{
    private final int nobility;
    private final int honor;
    private final int bravery;
    Griffindor(String inName, String inSurname, int inMagic, int inTransgression,
               int nobility, int honor, int bravery) {

        super(inName, inSurname, inMagic, inTransgression);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int summChar(){
        return nobility+honor+bravery;
    }
    String compareChar(@org.jetbrains.annotations.NotNull Griffindor obj){
        String answ;

        if (this.summChar() == obj.summChar()){
            answ = this.name+" "+this.surname+" и " + obj.name+" "+obj.surname +
                    " равные Гриффиндорцы.";
        }
        else if (this.summChar() > obj.summChar()){
            answ = this.name+" "+this.surname+" лучший Гриффиндорец, чем "+
                    obj.name+" "+obj.surname;
        }
        else {
            answ = obj.name+" "+obj.surname+" лучший Гриффиндорец, чем "+
                    this.name+" "+this.surname;
        }

        return answ;
    }

    @Override
    public String toString() {
        return name + " " + surname + '\n' +
               "Гриффиндор\n" +
               "Благородство = " + nobility + "\n" +
               "Честь = " + honor + "\n" +
               "Храбрость =" + bravery + "\n" +
               "Мощность колдовства = " + magic + "\n" +
               "Трансгрессия = " + transgression;
    }
}
