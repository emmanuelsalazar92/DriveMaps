

package TestingAPP;

public class Message {
    private String _TypeFunction;
    private String _Function;
    private String[] _Parameters;
    
    public void setTypeFunction(String pTypeFunction)
    {
        this._TypeFunction = pTypeFunction;
    }
    public String getTypeFunction()
    {
        return this._TypeFunction;
    }
    public void setFunction(String pFunction)
    {
        this._Function = pFunction;
    }
    public String getFunction()
    {
        return this._Function;
    }
    public void setParameters(String[] pParameters)
    {
        this._Parameters = pParameters;
    }
    public String[] getParameters()
    {
        return this._Parameters;
    }
}
