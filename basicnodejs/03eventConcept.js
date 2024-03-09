//standard module provided by node
const events= require('events');

//use module
var isha=new events.EventEmitter();

//register
isha.on('speak',()=>{
    //event handler
    console.log('isha is speaking');
});

//trigger the eevnt handler
isha.emit('speak');