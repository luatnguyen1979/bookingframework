/*
 * Created on Jan 30, 2018
 */
package asd.booking.domain;

public class Train {

    private String name;
    private int size;
    private String type;
    private String model;
    private String madeBy;
    private boolean isActive;
    private int capacity;

    public Train() {
    }

    public Train(String name, int size, String type, String model, String madeBy, boolean isActive, int capacity) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.model = model;
        this.madeBy = madeBy;
        this.isActive = isActive;
        this.capacity = capacity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the madeBy
     */
    public String getMadeBy() {
        return madeBy;
    }

    /**
     * @param madeBy the madeBy to set
     */
    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    /**
     * @return the isActive
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
