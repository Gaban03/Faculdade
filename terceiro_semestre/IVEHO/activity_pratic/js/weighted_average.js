document.getElementById("CalculateAverage").addEventListener("click", function () {
    let price = parseFloat(document.getElementById("Price").value);
    let quality = parseFloat(document.getElementById("Quality").value);
    let deliveryTime = parseFloat(document.getElementById("DeliveryTime").value);

    let weightPrice = 0.4;
    let weightQuality = 0.35;
    let weightDelivery = 0.25;

    let weightedAverage = (price * weightPrice) + (quality * weightQuality) + (deliveryTime * weightDelivery);

    document.getElementById("result").innerText = "Weighted Average: " + weightedAverage.toFixed(2);
});