
// //callback example
// const julie=()=>{
//     console.log("Julie needs to go to ofc, cab comes");

//     //John
//     setTimeout(() => {
//         console.log("John takes keys from Neighbours!!")
//     }, 5000);

//     console.log("Julie Left for ofc")
// }

// julie();


//promise example
//1. Promisifying function
const myPromise= ms => new Promise(resolve => setTimeout(resolve,ms));

//2. implementing promise- handler
const checkPromise= ()=> {
    return myPromise(5000).then(()=>{
        console.log("5 sec timer is now finished");
    });
}

//3. call function
const finalTest=async()=>{
    console.log("before calling");
    await checkPromise();
    console.log("after calling");
}

finalTest();