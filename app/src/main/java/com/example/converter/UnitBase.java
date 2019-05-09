package com.example.converter;


import java.io.Serializable;

public class UnitBase implements Serializable
{
    protected float _value;
    protected String _name = "Unit";
    protected String _convertedName = "Unit";

    public String get_Name() {
        return _name;
    }
    public String get_convertedName() {
        return _convertedName;
    }


    public void SetValue(float value)
    {
        _value = value;
    }
    public float GetConvertedValue()
    {
        throw new UnsupportedOperationException();
    }
}


