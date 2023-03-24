package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Review;
import kg.web.shop.repository.ReviewRepository;
import kg.web.shop.service.ReviewService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl extends BaseServiceImpl<Review, ReviewRepository> implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        super(reviewRepository);
        this.reviewRepository = reviewRepository;
    }

}
