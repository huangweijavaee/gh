package com.pio.goodhouse.web.account.form;

@ApiModel("基本账户信息")
public class BaseAccountForm {
    @NotBlank(message="")
    @ApiModelProperty(value="")
    @Pattern(regexp=WebConstants.USERNAME_PATTERN,message="")
    private String userName;
    private List<String> districtScope;
}
