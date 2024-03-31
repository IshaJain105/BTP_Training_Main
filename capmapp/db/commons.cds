namespace ishadb.commons;

//reusable data types
    type guid : String(32);

//aspect to hold address data
aspect address{
    HOUSENO: Int16;
    STREET: String(32);
    CITY: String(60);
    COUNTRY:String(20);
}
    