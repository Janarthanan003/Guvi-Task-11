package oopsconcept;

public class Tea {
	    private boolean isTeaPrepared;
	    private boolean isMilkAdded;
	    private boolean isSugarAdded;
	    public Tea() {
	        isTeaPrepared = false;
	        isMilkAdded = false;
	        isSugarAdded = false;
	    }
	    public void prepareTea() {
	        if (!isTeaPrepared) {
	            System.out.println("Preparing basic tea with hot water and tea leaves.");
	            isTeaPrepared = true;
	        } else {
	            System.out.println("Tea is already prepared.");
	        }
	    }
	    public void addMilk() {
	        if (isTeaPrepared && !isMilkAdded) {
	            System.out.println("Adding milk to the tea.");
	            isMilkAdded = true;
	        } else {
	            System.out.println("Milk is already added.");
	        }
	    }
	    public void addSugar() {
	        if (isTeaPrepared && !isSugarAdded) {
	            System.out.println("Adding sugar to the tea.");
	            isSugarAdded = true;
	        } else {
	            System.out.println("Sugar is already added.");
	        }
	    }
	    public static void main(String[] args) {
	        Tea myTea = new Tea();
	        myTea.prepareTea();
	        myTea.addMilk();
	        myTea.addSugar();   
	    }
	}