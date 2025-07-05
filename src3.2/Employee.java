package Third;

    public class Employee {
        private String name;
        private String position;
        private int rate;
        private int workDays;
        
        public Employee(String name, String position, int rate, int workDays) {
            this.name= name;
            this.position = position;
            this.rate = rate;
            this.workDays = workDays;
        }

        public void displayEmployee() {
            System.out.println("Employee Details");
            System.out.println("Name: " + this.name);
            System.out.println("Position: " + this.position);
            System.out.println("Daily Rate: " + this.rate);
            System.out.println("Working Days: " + this.workDays);
        }
        
        public double totalSalary() {
            return this.rate * this.workDays;
        }
    }
