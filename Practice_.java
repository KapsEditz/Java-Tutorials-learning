//Q.below's the question
//A company has different employee types:
//Developer
//Tester
//Manager
//All employees have common details like id, name, and salary, but each has different responsibilities.


package classes;

class Employe {
    int id = 101;
    String name = "Rahul";
    int salary = 50000;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employe {
    void work() {
        System.out.println("Developer writes code.");
    }
}

class Tester extends Employe {
    void work() {
        System.out.println("Tester tests software.");
    }
}

class Manager extends Employe {
    void work() {
        System.out.println("Manager manages team.");
    }
}

public class Practice_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Developer d = new Developer();
        Tester t = new Tester();
        Manager m = new Manager();

        d.display();
        d.work();

        System.out.println();

        t.display();
        t.work();

        System.out.println();

        m.display();
        m.work();

	}
}

