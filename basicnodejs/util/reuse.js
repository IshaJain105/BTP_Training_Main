// module or class or library 
module.exports={
    addNumber: function(a,b){
        console.log(a+b);
    },
    getSizeOfArray: function(arr){
        console.log(arr.length);
    },
    printArray: function(arr){
        for (let i = 0; i < arr.length; i++) {
            const element = arr[i];
            console.log(element)
        }
    },
    printJSON: function(object){
        for (const key in object){
            if(Object.hasOwnProperty.call(object,key)){
                const element= object[key];
                console.log(element);
            }
        }
    }
}