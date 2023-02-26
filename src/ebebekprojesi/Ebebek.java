package ebebekprojesi;

public class Ebebek {
    public static class EmployeePojo {
        public String name;
        public double salary;
        public int workHours;
        public int hireYear;
        public double bonus;
        public double vergiKesintisi;

        public EmployeePojo() {
        }

        public EmployeePojo(String name, double salary, int workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        public double tax() {
            if (salary < 1000) {
                return 0;
            } else {
                return newSalary() * 0.03;
            }
        }

        public int bonus() {
            if (workHours <= 40) {
                return 0;
            } else {
                return (workHours - 40) * 30;
            }
        }

        public double raiseSalary() {
            int calismaYili = 2021 - hireYear;
            if (calismaYili < 10) {
                return salary * 0.05;
            } else if (calismaYili < 20) {
                return salary * 0.1;
            } else {
                return salary * 0.15;
            }
        }

        public double newSalary() {
            double newSalary = (salary + raiseSalary() + bonus());
            return newSalary;
        }

        @Override
        public String toString() {
            return "EmployeePojo{" +
                    "name='" + name + '\'' + "\n" +
                    " Fazla Calisma  Ucreti : " + bonus() + "\n" +
                    " Maas zamminiz : " + raiseSalary() + "\n" +
                    " Vergi Kesintisi : " + tax() + "\n" +
                    " workHours=" + workHours + "\n" +
                    " hireYear=" + hireYear + "\n" +
                    " Net Maas=" + (newSalary() - tax()) +
                    '}';
        }
    }
}
