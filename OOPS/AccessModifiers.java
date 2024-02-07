class Account{
String name;
private long account_number;

Account(String name, long account_number){
    this.name = name;
    this.account_number = account_number;
}

//GETTERS AND SETTERS

public int getAccNo(){
    return this.account_number;
}
public void setName(String name){
    this.name = name;
}
public void setAccNo(int accNo){
    this.account_number = accNo;
}
}

public class AccessModifiers {
public static void main(String[] args) {
    Account a = new Account("Numaan",885746863843);

    System.out.print(a.getAccNo());

}    
}


