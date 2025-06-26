using Microsoft.AspNetCore.Mvc;
using AchPaymentApp.Models;

namespace AchPaymentApp.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class PaymentMethodController : ControllerBase
    {
        [HttpPost]
        public IActionResult SubmitPaymentMethod([FromBody] PaymentMethodRequest request)
        {
            if (string.IsNullOrWhiteSpace(request.OrganizationName) ||
                string.IsNullOrWhiteSpace(request.TaxIdNumber) ||
                string.IsNullOrWhiteSpace(request.PaymentMethod))
            {
                return BadRequest("Missing required fields.");
            }
            return Ok(new
            {
                message = "Payment method received successfully",
                data = request
            });
        }
    }
}