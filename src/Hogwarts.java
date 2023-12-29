public abstract class Hogwarts{
    final String name;
    final String surname;
    final int magic;
    final int transgression;

    Hogwarts(String inName,String inSurname,int inMagic,int inTransgression){
        name = inName;
        surname = inSurname;
        magic = inMagic;
        transgression = inTransgression;
    }

    String compare(@org.jetbrains.annotations.NotNull Hogwarts obj){
        String answPwr;
        String answTrans;

        if (this.transgression == obj.transgression){
            answTrans = this.name+" "+this.surname+" и " + obj.name+" "+obj.surname +
                    " равны по расстоянию трансгрессии.";
        }
        else if (this.transgression > obj.transgression){
            answTrans = this.name+" "+this.surname+" обладает большим расстоянием трансгрессии чем "+
                    obj.name+" "+obj.surname;
        }
        else {
            answTrans = obj.name+" "+obj.surname+" обладает большим расстоянием трансгрессии чем "+
                    this.name+" "+this.surname;
        }

        if(this.magic == obj.magic){
            answPwr = this.name+" "+this.surname+" и " + obj.name+" "+obj.surname +
                    " равны по мощности магии";
        }
        else if (this.magic > obj.magic) {
            answPwr = this.name+" "+this.surname+" обладает большей мощностью магии чем "
                    +obj.name+" "+obj.surname;
        }
        else {
            answPwr = obj.name+" "+obj.surname+" обладает большей мощностью магии чем "+
                    this.name+" "+this.surname;
        }
        return answTrans+". "+answPwr;
    }

}
