public class Notebook {
     private String name;
     private String ram;
     private String hdd;
     private String operatingSystem;
     private String colour;

     public Notebook(String name, String ram, String hdd, String operatingSystem, String colour) {
          this.name = name;
          this.ram = ram;
          this.hdd = hdd;
          this.operatingSystem = operatingSystem;
          this.colour = colour;
     }

     public String getName() {
          return name;
     }

     public String getRam() {
          return ram;
     }

     public String getHdd() {
          return hdd;
     }

     public String getOperatingSystem() {
          return operatingSystem;
     }

     public String getColour() {
          return colour;
     }

     @Override
     public String toString() {
          return "Notebook [Name - " + name + ", Ram - " + ram + ", HDD - " + hdd + ", OS - "
                    + operatingSystem + ", colour= " + colour + "]";
     }
}
