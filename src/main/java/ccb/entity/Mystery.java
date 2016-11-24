package ccb.entity;

/**
 * 事物实体
 * Created by Administrator on 2016/11/23.
 */
public class Mystery {
    private Integer mystery_id;//事物编号
    private Integer mystery_type;//事物类型（1：网点设施建设；2：办公设施类；3：电子设备类）
    private String mystery_detailed;//事物明细
    private Integer mystery_level;//服务保障级别(1:一级)
    private String mystery_trial;//是否初审
    private String mystery_department;//需求处理部门
    private String mystery_responseTime;//服务响应时间(小时)
    private String mystery_timeLimit;//服务解决时限（天）
    private String mystery_Remark;//事物备注
    private String mystery_describe;//需求事项描述
    private String mystery_declarationPoint;//需求申报点
    private String mystery_declarationName;//需求申报人
    private String mystery_phone;//联系电话
    private String mystery_declarationTime;//上报时间
    private String mystery_reminder;//是否催办
    private String mystery_submitPresident;//是否提交行长
    private String mystery_state;//当前所处状态

    public Mystery() {

    }



    public Integer getMystery_id() {
        return mystery_id;
    }

    public void setMystery_id(Integer mystery_id) {
        this.mystery_id = mystery_id;
    }

    public Integer getMystery_type() {
        return mystery_type;
    }

    public void setMystery_type(Integer mystery_type) {
        this.mystery_type = mystery_type;
    }

    public String getMystery_detailed() {
        return mystery_detailed;
    }

    public void setMystery_detailed(String mystery_detailed) {
        this.mystery_detailed = mystery_detailed;
    }

    public Integer getMystery_level() {
        return mystery_level;
    }

    public void setMystery_level(Integer mystery_level) {
        this.mystery_level = mystery_level;
    }

    public String getMystery_trial() {
        return mystery_trial;
    }

    public void setMystery_trial(String mystery_trial) {
        this.mystery_trial = mystery_trial;
    }

    public String getMystery_department() {
        return mystery_department;
    }

    public void setMystery_department(String mystery_department) {
        this.mystery_department = mystery_department;
    }

    public String getMystery_responseTime() {
        return mystery_responseTime;
    }

    public void setMystery_responseTime(String mystery_responseTime) {
        this.mystery_responseTime = mystery_responseTime;
    }

    public String getMystery_timeLimit() {
        return mystery_timeLimit;
    }

    public void setMystery_timeLimit(String mystery_timeLimit) {
        this.mystery_timeLimit = mystery_timeLimit;
    }

    public String getMystery_Remark() {
        return mystery_Remark;
    }

    public void setMystery_Remark(String mystery_Remark) {
        this.mystery_Remark = mystery_Remark;
    }

    public String getMystery_describe() {
        return mystery_describe;
    }

    public void setMystery_describe(String mystery_describe) {
        this.mystery_describe = mystery_describe;
    }

    public String getMystery_declarationPoint() {
        return mystery_declarationPoint;
    }

    public void setMystery_declarationPoint(String mystery_declarationPoint) {
        this.mystery_declarationPoint = mystery_declarationPoint;
    }

    public String getMystery_declarationName() {
        return mystery_declarationName;
    }

    public void setMystery_declarationName(String mystery_declarationName) {
        this.mystery_declarationName = mystery_declarationName;
    }

    public String getMystery_phone() {
        return mystery_phone;
    }

    public void setMystery_phone(String mystery_phone) {
        this.mystery_phone = mystery_phone;
    }
}