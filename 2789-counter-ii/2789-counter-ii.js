/**
 * @param {number} init
 * @return {Object}
 */
var createCounter = function(init) {
    let currentValue = init;  // Store the current value, initialized to `init`
    
    return {
        increment: function() {
            currentValue += 1;   // Increment the current value by 1
            return currentValue;  // Return the updated value
        },
        decrement: function() {
            currentValue -= 1;   // Decrement the current value by 1
            return currentValue;  // Return the updated value
        },
        reset: function() {
            currentValue = init; // Reset the value to the initial `init`
            return currentValue; // Return the reset value
        }
    };
};

