package Module;


public class Data
{
    private float distance;
    private float fuelUsed;

    public void setDistance(float value)
    {
        distance = value;
    }
    public float getDistance()
    {
        return distance;
    }

    public void setFuelUsed(float value)
    {
        fuelUsed = value;
    }
    public float getFuelUsed()
    {
        return fuelUsed;
    }

    public float getResult()
    {
        float result = ((getFuelUsed() * 100) / getDistance());
        return result;
    }

}
