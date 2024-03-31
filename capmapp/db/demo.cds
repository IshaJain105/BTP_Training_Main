namespace ishadb;
// we will keep all the common or reuable things in seperate folder >db>commons.cds and import here
using { ishadb.commons  as common} from './commons';
using { cuid, temporal, managed } from '@sap/cds/common';


context master {

    //first table for storing data
    entity student : common.address {
        key ID : common.guid;
        NAME : String(80);
        CLASS : Association to one standard;
        GENDER : String(1);
        // CITY : String(20);
    }

    entity standard{
        key ID : Int16;
        CLASSNAME :String(16);
        SECTION: Int16;
        CLASSTEACHER:String(80);
    }

    entity books{
        key ID : common.guid;
        BOOKNAME : String(40);
        AUTHOR : String(80);
    }

    

}
//using SAP provided standard aspect and types 
context trans {
    entity rentals: cuid, temporal,managed {
        student : Association to one master.student;
        book : Association to one master.books;
    }
}