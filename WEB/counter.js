var counter = 0;
function onCounterClick(count) {
    counter += count
    document.getElementById("counter").textContent = counter
}