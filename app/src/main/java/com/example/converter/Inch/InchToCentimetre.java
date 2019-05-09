package com.example.converter.Inch;

public class InchToCentimetre extends InchBase
{
    public InchToCentimetre()
    {
        super();
        _convertedName = "Centimetre";
    }

    @Override
    public float GetConvertedValue()
    {
        return _value * 2.54f;
    }
}
