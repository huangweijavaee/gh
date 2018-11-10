package com.pio.goodhouse.web.account.form;

import java.awt.print.PageFormat;
@ApiModel//说明类，用于参数用实体类接受，而@api也用作类，只是用来标识这个类时swagger资源
public class AccountListForm extends PageForm  {
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @ApiModelProperty(name="搜索关键字 账号名或者公司名 默认不传/")
    //@ApiModelProperty用来表示对model属性的说明或者数据操作的修改
    private String keyWord;
   @ApiModelProperty(name="账号状态 0.正常 1.冻结 2.全部/不传")
    private Integer isDeleted;
    @ApiModelProperty(name="部门")
   private String department;





}
