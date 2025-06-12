package Models;

public class Contact {
    private String name;
    private String phone;
    
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    
    @Override
    public String toString() {
        return "Contact [Name: " + name + ", Phone: " + phone + "]";
    }

    @Override
    public int hashCode() {
        return (name != null) ? name.toLowerCase().hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        if(this.name == null) {
            return contact.name == null;
        } else {
            return this.name.equalsIgnoreCase(contact.name);
        }
    }
}
