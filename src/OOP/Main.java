package OOP;

public class Main {
    public static void main(String[] args){
//        Browser
        var browser = new Browser();
        browser.navigate("google.com");

        System.out.println("**********************");

//          Employee
        var employee = new Employee(50000,20);
//        we used constructor for create new object with value in 1 line, so we can remove these 2 lines
//        employee.setBaseSalary(50000);
//        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        Employee.printNumberOfEmployees();
        System.out.println(wage);

        System.out.println("**********************");

//      Text Box
        var textBox1 = new TextBox();
        textBox1.setText("Box 1 !!");
        System.out.println(textBox1.text);
        var textBox2 = new TextBox();
        textBox2.setText("Box 2 !!");
        System.out.println(textBox2.text);

        System.out.println("**********************");

//        UIControl
//        var control = new UIControl(true);
//        control.disable();
//        System.out.println(control.isEnable());
//        bcuz we textbox class of UIControl class we can have access to all methods of UIControl class using textbox class.
//        textbox class inheritance of UIControl class(ers bari karde)
//        so we can write it and this right and will work
        var controls = new TextBox();
        controls.enable();
        System.out.println(controls.isEnable());

        System.out.println("**********************");

//        hashCode
        System.out.println(textBox1.hashCode());
        var textBox3 = textBox1;
        System.out.println(textBox3.hashCode());
        System.out.println(textBox2.hashCode());
        System.out.println(textBox3.equals(textBox1));
        textBox3.setText("hello");
        System.out.println(textBox3.toString());

        System.out.println("**********************");

//      upcasting and down casting
//        var control3 = new UIControl(true);
        var text1 = new TextBox();
        show(text1);
    }
    public static void show(UIControl control){
        if(control instanceof TextBox){
            var textboxx = (TextBox)control;
            textboxx.setText("Niloo");
        }
        System.out.println(control);

        System.out.println("**********************");
//        Point
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point1.equals(new TextBox()));

        System.out.println("**********************");

//        Check Box in polymorphism
        UIControl[] controls1 = { new TextBox(), new CheckBox()};
        for(var controls : controls1)
            controls.render();
    }
}
