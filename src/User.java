public class User {

    private int _id;
    private static int _idCounter;
    public String Name;
    public double balance;

    public User(String Name,double balance)
    {
        this._id=++this._idCounter;
        this.Name=Name;
        this.balance=balance;

    }

    @Override
    public String toString() {
        return "Name: " + Name + ",Balance: " + balance;
    }

    public int get_id() {
        return _id;
    }
}
