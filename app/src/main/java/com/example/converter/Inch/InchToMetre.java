package com.example.converter.Inch;

import android.os.Parcelable;

public class InchToMetre extends InchBase
{
    public InchToMetre()
    {
        super();
        _convertedName = "Metre";
    }

    @Override
    public float GetConvertedValue()
    {
        return _value * 0.0254f;
    }
}
