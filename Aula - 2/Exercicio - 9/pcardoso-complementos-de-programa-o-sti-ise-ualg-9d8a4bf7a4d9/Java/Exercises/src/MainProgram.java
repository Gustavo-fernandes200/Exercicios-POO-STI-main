
public class MainProgram {
  
  public static void main(String[] args) {
    
    Employee e1 = new Employee();
    e1.setName("Francisco");
    e1.setCcNumber("198187287");
    e1.setDepartament("Electrical Engineering");
    e1.setPhoneNumber("289800100");
    e1.setSalary(2000);
    Date d1 = new Date();
    e1.setEntranceDate(d1);
    d1.setDay(21);
    d1.setMonth(12);
    d1.setYear(2015);
    
    e1.print();
    
    Employee e2 = new Employee();
    e2.setName("João");
    e2.setCcNumber("2131321313");
    e2.setDepartament("Informatics");
    e2.setPhoneNumber("289800101");
    e2.setSalary(2000);
    Date d2 = new Date();
    d2.setDate(22, 12, 2011);
    e2.setEntranceDate(d2);
    
    e2.print();
    
    Employee e3 = new Employee();
    e3.setName("Francisco");
    e3.setCcNumber("198187287");
    e3.setDepartament("Electrical Engineering");
    e3.setPhoneNumber("289800100");
    e3.setSalary(2000);
    Date d3 = new Date();
    e3.setEntranceDate(d3);
    d3.setDay(21);
    d3.setMonth(12);
    d3.setYear(2015);
    
    e3.print();
    
    if (e1 == e3) {
      System.out.println("e1 == e3");
    } else {
      System.out.println("e1 <> e3");
    }
    
    Employee e4;
    
    e4 = e1;
    
    if (e1 == e4) {
      System.out.println("e1 == e4");
    } else {
      System.out.println("e1 <> e4");
    }
    
  }
  
}
