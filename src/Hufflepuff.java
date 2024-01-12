
public class Hufflepuff extends Hogwarts{
    private final int hardWork;
    private final int loyalty;
    private final int honesty;
    Hufflepuff(String inName, String inSurname, int inMagic,
               int inTransgression, int hardWork, int loyalty, int honesty) {
        super(inName, inSurname, inMagic, inTransgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int summChar(){
        return hardWork+loyalty+honesty;
    }

    String compareChar(Hufflepuff obj){
        String answ;

        if (this.summChar() == obj.summChar()){
            answ = this.name+" "+this.surname+" и " + obj.name+" "+obj.surname +
                    " равные Пуффендуйцы.";
        }
        else if (this.summChar() > obj.summChar()){
            answ = this.name+" "+this.surname+" лучший Пуффендуец, чем "+
                    obj.name+" "+obj.surname;
        }
        else {
            answ = obj.name+" "+obj.surname+" лучший Пуффендуец, чем "+
                    this.name+" "+this.surname;
        }

        return answ;
    }

    @Override
    public String toString() {
        return name + " " + surname + '\n' +
                "Пуффендуй\n" +
                "Трудолюбие = " + hardWork + "\n" +
                "Верность = " + loyalty + "\n" +
                "Честность =" + honesty + "\n" +
                "Мощность колдовства = " + magic + "\n" +
                "Трансгрессия = " + transgression;
    }

}
