package com.example.converter.Inch;

public class InchToFoot extends InchBase
{
    public InchToFoot()
    {
        super();
        _convertedName = "Foot";
    }

    @Override
    public float GetConvertedValue()
    {
        return _value * 0.0833333f;
    }
}
