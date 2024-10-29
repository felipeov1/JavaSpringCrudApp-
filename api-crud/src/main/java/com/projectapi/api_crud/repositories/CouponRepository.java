package com.projectapi.api_crud.repositories;

import com.projectapi.api_crud.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository <Coupon, UUID> {
}
