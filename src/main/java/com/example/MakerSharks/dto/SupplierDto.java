package com.example.MakerSharks.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDto {

    private Long supplierId;

    @NotNull(message = "Company Name should not be null")
    @NotBlank(message = "Company Name should not be blank")
    private String companyName;

    @NotNull(message = "Website should not be null")
    @NotBlank(message = "Website should not be blank")
    private String website;

    @NotNull(message = "Location should not be null")
    @NotBlank(message = "Location should not be blank")
    private String location;

    @NotNull(message = "Nature of business should not be null")
    @NotBlank(message = "Nature of business should not be blank")
    @Pattern(regexp = "^(small_scale|medium_scale|large_scale)$", message = "Invalid nature of business")
    private String natureOfBusiness;

    @NotNull(message = "Manufacturing processes should not be null")
    @NotBlank(message = "Manufacturing processes should not be blank")
    @Pattern(regexp = "^(moulding|3d_printing|casting|coating)$", message = "Invalid manufacturing process")
    private String manufacturingProcesses;
}
