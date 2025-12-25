package persian.googolplexian.metamath.MainFragments.Converter;

import persian.googolplexian.metamath.MainFragments.Converter.FieldsList.Class_Con_FieldData;

import static persian.googolplexian.metamath.MainFragments.Converter.FragmentConverter.CON_SelectedFieldID;

public class Class_Con_Calculation {

    public static void Calculation_UnitsPrefix(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 22)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 25)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 26)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 42)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 45)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 48)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 22)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 42)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 45)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 42)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 39)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 36)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 33)));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 30)));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 27)));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 26)));
                break;

            case 9:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 22)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 25)));
                break;

            case 10:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 24)));
                break;

            case 11:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 25)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 22)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 23)));
                break;

            case 12:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 26)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 22)));
                break;

            case 13:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 21)));
                break;

            case 14:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 18)));
                break;

            case 15:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 15)));
                break;

            case 16:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                break;

            case 17:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 14)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                break;

            case 18:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 42)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                break;

            case 19:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 45)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 42)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 22)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 20)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 19)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                break;

            case 20:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 48)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 45)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 42)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 39)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 36)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 33)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 30)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 27)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 26)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 25)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 23)));
                Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 22)));
                Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Length(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 25)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 22)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 19)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 18)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 / Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 / Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 / Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 / Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 16)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 13)));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.0254 * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.0254 * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.0254 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.0254 * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0254 * Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.0254 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.08333));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.02778));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.015783));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.0254 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 2.6848 / Math.pow(10, 18)));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.3048 * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.3048 * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.3048 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.3048 * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.3048 * Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.3048 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 12));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.33333));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.0001893));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.3048 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 3.2217 / Math.pow(10, 17)));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.9144 * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.9144 * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.9144 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.9144 * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.9144 * Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.9144 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 36));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.0005681));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.9144 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 9.6652 / Math.pow(10, 17)));
                break;

            case 9:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 1609.344 * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1609.344 * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1609.344 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1609.344 * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1609.344 * Math.pow(10, 0)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1609.344 / Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 63360));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 5280));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1760));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 1609.344 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.7011 / Math.pow(10, 13)));
                break;

            case 10:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 1)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 39.37008 / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.28084 / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.093613 / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.000621 / Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.057 / Math.pow(10, 26)));
                break;

            case 11:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 24)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 21)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 18)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 15)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 3.7247 * Math.pow(10, 17)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.1039 * Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.0346 * Math.pow(10, 16)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 5.8786 * Math.pow(10, 12)));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 9.4607 * Math.pow(10, 25)));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Area(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber / Math.pow(Math.pow(10, 1), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(Math.pow(10, 6), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(39.37008 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(3.28084 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(1.093613 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.000621 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 10)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(Math.pow(10, 1), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber / Math.pow(Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(Math.pow(10, 5), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(39.37008 / Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(3.28084 / Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(1.093613 / Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.000621 / Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 8)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(39.37008 / Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(3.28084 / Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(1.093613 / Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.000621 / Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 4)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(Math.pow(10, 6), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(Math.pow(10, 5), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(39.37008 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(3.28084 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(1.093613 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.000621 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 2)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(0.0254 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(0.0254 * Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(0.0254 * Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(0.0254 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(0.08333, 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(0.02778, 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.015783, 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 6.4516 / Math.pow(10, 8)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(0.3048 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(0.3048 * Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(0.3048 * Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(0.3048 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(12, 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(0.33333, 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.0001893, 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 9.290304 / Math.pow(10, 6)));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(0.9144 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(0.9144 * Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(0.9144 * Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(0.9144 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(36, 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(3, 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(0.0005681, 2)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 8.3612736 / Math.pow(10, 5)));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(1609.344 * Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(1609.344 * Math.pow(10, 2), 2)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(1609.344 * Math.pow(10, 0), 2)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(1609.344 / Math.pow(10, 3), 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(63360, 2)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(5280, 2)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(1760, 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 258.9988));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / 6.4516 * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / 9.290304 * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / 8.3612736 * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / 258.9988));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Volume(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 10));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 61.02374));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.03531467));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00130795));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.26417));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.21997));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 4.22675));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 3.51951));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 4));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.1));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 100));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.0001));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 6.102374));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.003531467));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.000130795));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.026417));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.021997));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.422675));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.351951));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 0.4));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.01));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.000001));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.06102374));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.00003531467));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00000130795));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.00026417));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.00021997));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 0.00422675));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.00351951));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 0.004));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 10000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 61023.744095));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 35.31467));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 1.3079506));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 264.17205236));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 219.9692483));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 4226.75));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 3519.51));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 4000));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.016387064));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.16387064));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 16.387064));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.000016387064));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.0005787037));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.0000214337051));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.004329));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.00360465));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 4.22675 * 0.016387064));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 3.51951 * 0.016387064));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 4 * 0.016387064));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 28.306847));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 283.06847));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 2830.6847));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.028306847));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1728));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.037));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 7.48052));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 6.22884));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 4.22675 * 28.306847));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 3.51951 * 28.306847));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 4 * 28.306847));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 764.5549));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 7645.549));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 764554.9));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.7645549));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 46656));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 27));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 201.97403));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 168.17856));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 4.22675 * 764.5549));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 3.51951 * 764.5549));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 4 * 764.5549));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 3.785411784));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 37.85411784));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 3785.411784));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.003785411784));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 231));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.13368056));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00495113169));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.8327));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 16));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 13.3228));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 15.14165));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 4.54609));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 45.4609));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 4546.09));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00454609));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 277.41943));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.160544));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00595));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 1.20095));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 19.2152));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 16));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 18.1844));
                break;

            case 9:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 10 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.001 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 61.02374 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.03531467 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00130795 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.26417 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.21997 * 0.23659));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.83267));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 0.94635));
                break;

            case 10:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 10 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.001 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 61.02374 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.03531467 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00130795 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.26417 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.21997 * 0.28413));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 1.20095));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * 1.136523));
                break;

            case 11:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.25));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 10 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.001 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 61.02374 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.03531467 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00130795 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.26417 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 0.21997 * 0.25));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 1.0567));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 0.8799));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Weight(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -9)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 2.204623 * Math.pow(10, -6)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 35.273962 * Math.pow(10, -6)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 2.204623 * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 35.273962 * Math.pow(10, -3)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 2.204623));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 35.273962));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 2.204623 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 35.273962 * Math.pow(10, 3)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 453592.37));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 453.59237));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.45359237));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00045359237));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 16));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 28349.523));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 28.349523));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.028349523));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.000028349523));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0625));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Time(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / 60));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24 * 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24 * 30)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24 * 365)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24 * 365) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24 * 365) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / (60 * 60 * 24 * 365) / 1000));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / 60));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24 * 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24 * 30)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24 * 365)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24 * 365) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24 * 365) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / (60 * 60 * 24 * 365) / 1000));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber / 60));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / (60 * 60)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24 * 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24 * 30)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24 * 365)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24 * 365) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24 * 365) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / (60 * 60 * 24 * 365) / 1000));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber / (60)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / (60 * 24)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / (60 * 24 * 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / (60 * 24 * 30)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / (60 * 24 * 365)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / (60 * 24 * 365) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / (60 * 24 * 365) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / (60 * 24 * 365) / 1000));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber / (24)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / (24 * 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / (24 * 30)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / (24 * 365)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / (24 * 365) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / (24 * 365) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / (24 * 365) / 1000));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber / (7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / (30)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / (365)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / (365) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / (365) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / (365) / 1000));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24 * 7));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24 * 7));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24 * 7));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24 * 7));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24 * 7));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 7));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber / (1 / (365 * 12 * 7))));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / (1 / (365 * 7))));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / (1 / (365 * 7)) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / (1 / (365 * 7)) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / (1 / (365 * 7)) / 1000));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24 * 30));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24 * 30));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24 * 30));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24 * 30));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24 * 30));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 30));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * (365 / 12 / 7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber / (1 / 365 / 12)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / (1 / 365 / 12) / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / (1 / 365 / 12) / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / (1 / 365 / 12) / 1000));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24 * 365));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24 * 365));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24 * 365));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24 * 365));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24 * 365));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 365));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 52));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 12));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber / 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / 100));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / 1000));
                break;

            case 9:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24 * 365 * 10));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24 * 365 * 10));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24 * 365 * 10));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24 * 365 * 10));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24 * 365 * 10));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 365 * 10));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 52 * 10));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 12 * 10));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 10));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber / 10));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / 100));
                break;

            case 10:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24 * 365 * 100));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24 * 365 * 100));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24 * 365 * 100));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24 * 365 * 100));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24 * 365 * 100));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 365 * 100));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 52 * 100));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 12 * 100));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 100));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 10));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber / 10));
                break;

            case 11:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * 60 * 60 * 24 * 365 * 1000));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * 60 * 60 * 24 * 365 * 1000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 60 * 60 * 24 * 365 * 1000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60 * 24 * 365 * 1000));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 24 * 365 * 1000));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 365 * 1000));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 52 * 1000));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 12 * 1000));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 100));
                Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * 10));
                Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Temperature(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter((InputNumber * 1.8) + 32));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber + 273.15));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter((InputNumber - 32) * 0.555556));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter((InputNumber + 459.67) * 0.555556));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber - 273.15));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter((InputNumber * 1.8) + 459.67));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Power(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1341.0221));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1359.6216));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1340.4826));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 2.65522374 * Math.pow(10, 9)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1.3410221));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1.3596216));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1.3404826));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 2.65522374 * Math.pow(10, 6)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.0013410221));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0013596216));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.0013404826));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 2.65522374 * Math.pow(10, 3)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000745699872));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.745699872));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 745.699872));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1.0139));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.9996));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 1980000));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 7.45699872 * Math.pow(10, 9)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.00073549875));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.73549875));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 735.49875));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.98632));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.98592));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 1952913.7398));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 7.3549875 * Math.pow(10, 9)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000746));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.746));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 746));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1.0004));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1.0143));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 1980796.9081));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 7.46 * Math.pow(10, 9)));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 3.766161 * Math.pow(10, -10)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 3.766161 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 3.766161 * Math.pow(10, -4)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 5.0505 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 5.1206 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 5.0485 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.766161 * Math.pow(10, 3)));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -13)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -10)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1.3410221 * Math.pow(10, -10)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1.3596216 * Math.pow(10, -10)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1.3404826 * Math.pow(10, -10)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 2.65522374 * Math.pow(10, -4)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Energy(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.27778));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 277.77778));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 239.00574));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 239005.74));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 737562.1493));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 6.2415 * Math.pow(10, 24)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00027778));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.27777778));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 239.00574));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.23900574));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 737.5621493));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 6.2415 * Math.pow(10, 21)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00000027778));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.00027777778));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.23900574));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00023900574));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.7375621493));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 6.2415 * Math.pow(10, 18)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 3.6));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 3600));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 3600000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 860420.6501));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 860.4206501));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 2655223.7374));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 2.2469 * Math.pow(10, 25)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.0036));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 3.6));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 3600));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 860.4206501));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.8604206501));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 2655.2237374));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 2.2469 * Math.pow(10, 22)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000004184));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.004184));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 4.184));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.0000011622));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0011622));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3.08596));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 4.184 * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 2.6114 * Math.pow(10, 19)));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.004184));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 4.184));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 4184));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.0011622));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 1.1622));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 3085.96));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 4.184 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 2.6114 * Math.pow(10, 22)));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 1.35582 * Math.pow(10, -6)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.00135582));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1.35582));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.0000003766161));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0003766161));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.0003240483));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.3240483));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.35582 * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 8.4623 * Math.pow(10, 18)));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000001 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.001 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00000027778 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.00027777778 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.23900574 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 0.00023900574 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 0.7375621493 * Math.pow(10, -7)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * 6.2415 * Math.pow(10, 11)));
                break;

            case 9:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 1.6022 * Math.pow(10, -25)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1.6022 * Math.pow(10, -22)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1.6022 * Math.pow(10, -19)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 4.4505 * Math.pow(10, -26)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 4.4505 * Math.pow(10, -23)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.0038293 * Math.pow(10, -20)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 3.8293 * Math.pow(10, -20)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 1.1817 * Math.pow(10, -19)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1.6022 * Math.pow(10, -12)));
                Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Fuel(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(100 / (InputNumber * 1)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(62.1371 / (InputNumber * 1)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(100 / (InputNumber * 1)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.621371));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(62.1371 / (InputNumber * 1)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1.609344));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Pressure(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.01));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00987));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.14503774));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 7.50064));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.00001));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00000987));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.00014503774));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 0.00750064));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 100));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 100000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.987));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 14.503774));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 750.064));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 101.325));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 101325));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1.01335));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 14.69595));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 760.0021));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 6.8947573));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 6894.7573));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.068947573));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.068045573));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 51.7151));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.133322));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 133.322));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.0013));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.00131579));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0193367213));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Data(double InputNumber) {
        double ConversionFactor = 0;

        switch (CON_SelectedFieldID) {
            case 0:
                ConversionFactor = 1;
                break;
            case 1:
                ConversionFactor = Math.pow(10, 3);
                break;
            case 2:
                ConversionFactor = Math.pow(10, 6);
                break;
            case 3:
                ConversionFactor = Math.pow(10, 9);
                break;
            case 4:
                ConversionFactor = Math.pow(10, 12);
                break;
            case 5:
                ConversionFactor = Math.pow(10, 15);
                break;
            case 6:
                ConversionFactor = Math.pow(10, 18);
                break;
            case 7:
                ConversionFactor = Math.pow(10, 21);
                break;
            case 8:
                ConversionFactor = Math.pow(2, 10);
                break;
            case 9:
                ConversionFactor = Math.pow(2, 20);
                break;
            case 10:
                ConversionFactor = Math.pow(2, 30);
                break;
            case 11:
                ConversionFactor = Math.pow(2, 40);
                break;
            case 12:
                ConversionFactor = Math.pow(2, 50);
                break;
            case 13:
                ConversionFactor = Math.pow(2, 60);
                break;
            case 14:
                ConversionFactor = Math.pow(2, 70);
                break;
            case 15:
                ConversionFactor = 1 * 8;
                break;
            case 16:
                ConversionFactor = Math.pow(10, 3) * 8;
                break;
            case 17:
                ConversionFactor = Math.pow(10, 6) * 8;
                break;
            case 18:
                ConversionFactor = Math.pow(10, 9) * 8;
                break;
            case 19:
                ConversionFactor = Math.pow(10, 12) * 8;
                break;
            case 20:
                ConversionFactor = Math.pow(10, 15) * 8;
                break;
            case 21:
                ConversionFactor = Math.pow(10, 18) * 8;
                break;
            case 22:
                ConversionFactor = Math.pow(10, 21) * 8;
                break;
            case 23:
                ConversionFactor = Math.pow(2, 10) * 8;
                break;
            case 24:
                ConversionFactor = Math.pow(2, 20) * 8;
                break;
            case 25:
                ConversionFactor = Math.pow(2, 30) * 8;
                break;
            case 26:
                ConversionFactor = Math.pow(2, 40) * 8;
                break;
            case 27:
                ConversionFactor = Math.pow(2, 50) * 8;
                break;
            case 28:
                ConversionFactor = Math.pow(2, 60) * 8;
                break;
            case 29:
                ConversionFactor = Math.pow(2, 70) * 8;
                break;
        }

        Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * ConversionFactor));

        Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -9) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -12) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -15) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -18) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -21) * ConversionFactor));

        Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -10) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(9).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -20) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(10).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -30) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(11).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -40) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(12).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -50) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(13).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -60) * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(14).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -70) * ConversionFactor));


        Class_Con_FieldData.CON_FieldList.get(15).setCON_Field_Text(Filter(InputNumber / 8 * ConversionFactor));

        Class_Con_FieldData.CON_FieldList.get(16).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -3) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(17).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -6) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(18).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -9) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(19).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -12) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(20).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -15) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(21).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -18) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(22).setCON_Field_Text(Filter(InputNumber * Math.pow(10, -21) / 8 * ConversionFactor));

        Class_Con_FieldData.CON_FieldList.get(23).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -10) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(24).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -20) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(25).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -30) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(26).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -40) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(27).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -50) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(28).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -60) / 8 * ConversionFactor));
        Class_Con_FieldData.CON_FieldList.get(29).setCON_Field_Text(Filter(InputNumber * Math.pow(2, -70) / 8 * ConversionFactor));

    }

    public static void Calculation_Speed(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 3.6));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 2.23694));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1.94385));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0294));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 3.335641 * Math.pow(10, -9)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber / 3.6));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.6214));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.54));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0008163));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 9.2657 * Math.pow(10, -10)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.44704));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1.609344));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 0.868977));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0013137));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1.4912 * Math.pow(10, -9)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.514444));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1.8519984));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1.1507785));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.00151178));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1.716 * Math.pow(10, -9)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 340.29));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1225.044));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 761.2071));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 661.4714));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 1.1351 * Math.pow(10, -6)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 299792458));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 3.6 * 299792458));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 2.23694 * 299792458));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1.94385 * 299792458));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 0.0294 * 299792458));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Sound(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 10));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1.1513));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.1));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.11513));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.8686));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 8.686));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Frequency(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1000000000));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * 1000000000));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 13)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 11)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 11) * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 9) * (Math.PI / 180)));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1000000));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * 1000000));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 10)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 8)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 10) * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 8) * (Math.PI / 180)));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * 1000));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 7)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 5)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 7) * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 5) * (Math.PI / 180)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000000001));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.000001));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 4)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 2)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 2.16 * Math.pow(10, 4) * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 3.6 * Math.pow(10, 2) * (Math.PI / 180)));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000000001 * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.000001 * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001 * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1 * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 360));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * 6));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 360 * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 6 * (Math.PI / 180)));
                break;

            case 5:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000000001 * ((double) 1 / (double) 21600)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.000001 * ((double) 1 / (double) 21600)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001 * ((double) 1 / (double) 21600)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1 * ((double) 1 / (double) 21600)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * ((double) 1 / (double) 21600)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 1 * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 60) * (Math.PI / 180)));
                break;

            case 6:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000000001 * ((double) 1 / (double) 360)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.000001 * ((double) 1 / (double) 360)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001 * ((double) 1 / (double) 360)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1 * ((double) 1 / (double) 360)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * ((double) 1 / (double) 360)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 60));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 60 * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * 1 * (Math.PI / 180)));
                break;

            case 7:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000000001 * ((double) 1 / (double) 21600) * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.000001 * ((double) 1 / (double) 21600) * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001 * ((double) 1 / (double) 21600) * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1 * ((double) 1 / (double) 21600) * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * ((double) 1 / (double) 21600) * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 60) * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 60)));
                break;

            case 8:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 0.000000001 * ((double) 1 / (double) 21600) * 60 * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.000001 * ((double) 1 / (double) 21600) * 60 * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001 * ((double) 1 / (double) 21600) * 60 * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 1 * ((double) 1 / (double) 21600) * 60 * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60 * ((double) 1 / (double) 21600) * 60 * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(5).setCON_Field_Text(Filter(InputNumber * 60 * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(6).setCON_Field_Text(Filter(InputNumber * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(7).setCON_Field_Text(Filter(InputNumber * 60));
                Class_Con_FieldData.CON_FieldList.get(8).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Density(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 0.001));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 0.001));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * 1));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * 1000));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * 1));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static void Calculation_Angle(double InputNumber) {
        switch (CON_SelectedFieldID) {
            case 0:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * (180 / Math.PI)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * (400 / (Math.PI * 2))));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * (60 / (Math.PI / 180))));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * (3600 / (Math.PI / 180))));
                break;

            case 1:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * (Math.PI / 180)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * ((double) 400 / (double) 360)));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * 60));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 3600));
                break;

            case 2:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * ((Math.PI * 2) / 400)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * ((double) 360 / (double) 400)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * (((double) 360 / (double) 400) * 60)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * (((double) 360 / (double) 400) * 3600)));
                break;

            case 3:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * ((Math.PI / 180) / 60)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * (((double) 1 / (double) 60) * ((double) 400 / (double) 360))));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber * 60));
                break;

            case 4:
                Class_Con_FieldData.CON_FieldList.get(0).setCON_Field_Text(Filter(InputNumber * ((Math.PI / 180) / 3600)));
                Class_Con_FieldData.CON_FieldList.get(1).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 3600)));
                Class_Con_FieldData.CON_FieldList.get(2).setCON_Field_Text(Filter(InputNumber * (((double) 1 / (double) 3600) * ((double) 400 / (double) 360))));
                Class_Con_FieldData.CON_FieldList.get(3).setCON_Field_Text(Filter(InputNumber * ((double) 1 / (double) 60)));
                Class_Con_FieldData.CON_FieldList.get(4).setCON_Field_Text(Filter(InputNumber));
                break;
        }
    }

    public static String Filter(double num) {
        if (num == (int) num) {
            return Math.round(num) + "";
        } else {
            return num + "";
        }
    }

}
