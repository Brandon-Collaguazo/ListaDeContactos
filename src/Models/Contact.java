package Models;

public class Contact <T, U> {
    private T name;
    private U phone;
    
    public Contact(T name, U phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact() {
    }

    public T getName() {
        return name;
    }

    public U getPhone() {
        return phone;
    }
    
    @Override
    public String toString() {
        return "Contact [Name: " + name + ", Phone: " + phone + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if( obj==null) return false;
        if ( this == obj) return true;
    }
}
