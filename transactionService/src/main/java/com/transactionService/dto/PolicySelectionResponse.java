package com.transactionService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PolicySelectionResponse {
    private PolicySelectionDto policySelectedDetails;
}
