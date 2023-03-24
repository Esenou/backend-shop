package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Review;
import kg.web.shop.service.ReviewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController extends BaseController<Review, ReviewService> {
    private final ReviewService reviewService;

    public ReviewController(ReviewService baseService, ReviewService reviewService) {
        super(baseService);
        this.reviewService = reviewService;
    }
}
