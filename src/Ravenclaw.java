import org.jetbrains.annotations.NotNull;

public class Ravenclaw extends Hogwarts{
    private final int knowledge;
    private final int wisdom;
    private final int wit;
    private final int creation;

    Ravenclaw(String inName, String inSurname, int inMagic,
              int inTransgression, int knowledge, int wisdom, int wit, int creation) {
        super(inName, inSurname, inMagic, inTransgression);
        this.knowledge = knowledge;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int summChar(){
        return knowledge+wisdom+wit+creation;
    }

    String compareChar(@NotNull Ravenclaw obj){
        String answ;

        if (this.summChar() == obj.summChar()){
            answ = this.name+" "+this.surname+" и " + obj.name+" "+obj.surname +
                    " равные Когтевранцы.";
        }
        else if (this.summChar() > obj.summChar()){
            answ = this.name+" "+this.surname+" лучший Когтевранец, чем "+
                    obj.name+" "+obj.surname;
        }
        else {
            answ = obj.name+" "+obj.surname+" лучший Когтевранец, чем "+
                    this.name+" "+this.surname;
        }

        return answ;
    }

    @Override
    public String toString() {
        return name + " " + surname + '\n' +
                "Когтевран\n" +
                "Ум = " + knowledge + "\n" +
                "Мудрость = " + wisdom + "\n" +
                "Остроумие =" + wit + "\n" +
                "Творчество =" + creation + "\n" +
                "Мощность колдовства = " + magic + "\n" +
                "Трансгрессия = " + transgression;
    }
}
