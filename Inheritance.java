class Product{
    private String name;
    private String category;
    private double price;

    Product(String name,String category,double price){
        this.name=name;
        this.category=category;
        this.price=price;
    }

    void displayDetails(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Category: "+category);
        System.out.println("Product Price: "+price);
    }
}

class Electronics extends Product{
    private double warranty;
    private String brand;

    Electronics(String name,String category,double price,double warranty,String brand){
        super(name,category,price);
        this.warranty=warranty;
        this.brand=brand;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty: "+warranty+" years");
        System.out.println("Brand: "+brand);
    }
}

class Clothing extends Product{
    private String size;
    private String material;

    Clothing(String name,String category,double price,String size,String material){
        super(name,category,price);
        this.size=size;
        this.material=material;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Size: "+size);
        System.out.println("Material: "+material);
    }
}
public class Inheritance{
    public static void main(String[] args){
        Electronics ele=new Electronics("Laptop","Electronics",50000,2,"Dell");
        ele.displayDetails();

        Clothing clo=new Clothing("T-Shirt","Clothing",1000,"M","Cotton");
        clo.displayDetails();
    }
}