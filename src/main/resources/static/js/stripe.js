const stripe = Stripe('pk_test_51OJyazJQSfvfnSot0Y2UC5Mzr3f7mBuGseAHzdmbwFwhE9Qh1vRRiEikqDJpSXMzhWflT7Lf7JNlMckVfbJx6W3V00dDeiw8a6');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });