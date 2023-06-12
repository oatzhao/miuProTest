package Lecture5.Computer;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }
    public double getProcessorSpeed(){
        return processorSpeed;
    };

    double computePower(){
        return 0.0;
    };

    @Override
    public String toString(){
        return "manufacturer:" + manufacturer +"processor:"+processor+"ramSize:"+ramSize+"processorSpeed:"+processorSpeed;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof Computer))
            return false;
        Computer computer = (Computer) o;
        boolean manufacturerEquals = (this.manufacturer == null && computer.manufacturer == null)
                || (this.manufacturer != null && this.manufacturer.equals(computer.manufacturer));
        boolean processor = (this.processor == null && computer.processor == null)
                || (this.processor != null && this.processor.equals(computer.processor ));
        return this.ramSize == computer.ramSize && this.processorSpeed == computer.processorSpeed && manufacturerEquals
                && processor;

    }

    @Override
    public final int hashCode(){
        return Objects .hash(manufacturer, processor);
    }

}
