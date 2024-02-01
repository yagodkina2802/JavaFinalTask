// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// - Создать множество ноутбуков.
// - Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// - Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.



package ControlHWJava;


public class Nout {
    private String model;
    private int accessMemory;
    private int hardDrive;
    private String RAM;
    private String color;

   public Nout(String model, int accessMemory, int hardDrive, String RAM, String color) {
      this.model = model;
      this.accessMemory = accessMemory;
      this.hardDrive = hardDrive;
      this.RAM = RAM;
      this.color = color;
      
      }

   public String getModel() {
      return model; 
   }
   public void setModel(String model) {
      this.model = model; 
      }
    public int getAccessMemory() {
        return accessMemory; 
     }
    public void setAccessMemory(int accessMemory) {
        this.accessMemory = accessMemory; 
        }
    public int getHardDrive() {
        return hardDrive; 
        }
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive; 
    }
    public String getRAM() {
        return RAM; 
        }
    public void setRAM(String RAM) {
        this.RAM = RAM; 
        }
        
       
   public String getColor() {
      return color; 
      }
   public void setColot(String color) {
      this.color = color; 
      }

    

   @Override
public String toString() {
    return "Nout [model: " + model + ", accessMemory: " + accessMemory + ", hardDrive: " + hardDrive + ", RAM:" + RAM
            + ", color: " + color + "]";
}

   @Override
   public boolean equals(Object obj) {
      if(this == obj){
         return true;
      }
      if(obj == null || getClass() != obj.getClass()){
         return false;
      }
      Nout nout = (Nout) obj;
      return model.equals(nout.model) && accessMemory == nout.accessMemory && hardDrive == nout.hardDrive && RAM == nout.RAM && color == nout.color;
      
   }
}
