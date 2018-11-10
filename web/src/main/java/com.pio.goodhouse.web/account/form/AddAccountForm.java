package com.pio.goodhouse.web.account.form;

import com.sun.istack.internal.NotNull;

@ApiModel("添加员工账户")
public class AddAccountForm {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<String> getDistrictScope() {
        return districtScope;
    }

    public void setDistrictScope(List<String> districtScope) {
        this.districtScope = districtScope;
    }

    @NotBlank(message = "account.field.name.isnull")//用来判断参数是否为空
    @ApiModelProperty("姓名")
    private String name;
    @NotBlank(message = "account.file.mobile.isnull")
    @Pattern(regexp = Constants.Mobile_Pattern, message = "account.field.mobile.pattern.error")//java自带Api，正则匹配
    @ApiModelProperty("手机号码")
    private String mobile;
    @NotBlank(message = "account.file.identity.isnull")
    @Pattern(regexp = Constants.ID_CARD_PATTERN, message = "account.field.identity.pattern.error")//java自带Api，正则匹配
    @ApiModelProperty("身份证号")
    private String identity;
    @NotBlank(message = "account.field.department.isnull")//用来判断参数是否为空
    @ApiModelProperty(value="department")
    private String department;
    @Length(message = "account.field.length.illegal")//用来判断参数是否为空
    @ApiModelProperty(value="角色名称")
    private String roleName;
    @NotNull(message="role.field.id.isnull")
    @ApiModelProperty(value="角色Id")
    private Long roleId;
    @NotNull(message="account.field.status.isnull")
    @ApiModelProperty("状态 0.正常 1.冻结")
    private Integer isDeleted;
    @NotEmpty(message="account.field.districtScope.is,empey")
    @ApiModelProperty(value="二级职能范围")
    private List<String> districtScope;














}