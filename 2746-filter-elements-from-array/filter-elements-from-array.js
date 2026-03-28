/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var final_arr = [];
    for(var i = 0 ; i < arr.length ; i++){
        if (fn(arr[i],i)){
            final_arr.push(arr[i]);
        }
    }
    return final_arr;
};