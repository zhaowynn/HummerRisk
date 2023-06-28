package com.hummer.common.core.domain;

import java.io.Serializable;

public class CloudResourceRela implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.name
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.resource_item_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String resourceItemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.plugin_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String pluginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.account_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.region_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String regionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.resource_type
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String resourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.hummer_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String hummerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.category
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.x_axis
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private Long xAxis;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.y_axis
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private Long yAxis;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_resource_rela.create_time
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private Long createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_resource_rela
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.id
     *
     * @return the value of cloud_resource_rela.id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.id
     *
     * @param id the value for cloud_resource_rela.id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.name
     *
     * @return the value of cloud_resource_rela.name
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.name
     *
     * @param name the value for cloud_resource_rela.name
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.resource_item_id
     *
     * @return the value of cloud_resource_rela.resource_item_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getResourceItemId() {
        return resourceItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.resource_item_id
     *
     * @param resourceItemId the value for cloud_resource_rela.resource_item_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setResourceItemId(String resourceItemId) {
        this.resourceItemId = resourceItemId == null ? null : resourceItemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.plugin_id
     *
     * @return the value of cloud_resource_rela.plugin_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.plugin_id
     *
     * @param pluginId the value for cloud_resource_rela.plugin_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.account_id
     *
     * @return the value of cloud_resource_rela.account_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.account_id
     *
     * @param accountId the value for cloud_resource_rela.account_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.region_id
     *
     * @return the value of cloud_resource_rela.region_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.region_id
     *
     * @param regionId the value for cloud_resource_rela.region_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.resource_type
     *
     * @return the value of cloud_resource_rela.resource_type
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.resource_type
     *
     * @param resourceType the value for cloud_resource_rela.resource_type
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.hummer_id
     *
     * @return the value of cloud_resource_rela.hummer_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getHummerId() {
        return hummerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.hummer_id
     *
     * @param hummerId the value for cloud_resource_rela.hummer_id
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setHummerId(String hummerId) {
        this.hummerId = hummerId == null ? null : hummerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.category
     *
     * @return the value of cloud_resource_rela.category
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.category
     *
     * @param category the value for cloud_resource_rela.category
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.x_axis
     *
     * @return the value of cloud_resource_rela.x_axis
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public Long getxAxis() {
        return xAxis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.x_axis
     *
     * @param xAxis the value for cloud_resource_rela.x_axis
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setxAxis(Long xAxis) {
        this.xAxis = xAxis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.y_axis
     *
     * @return the value of cloud_resource_rela.y_axis
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public Long getyAxis() {
        return yAxis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.y_axis
     *
     * @param yAxis the value for cloud_resource_rela.y_axis
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setyAxis(Long yAxis) {
        this.yAxis = yAxis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_resource_rela.create_time
     *
     * @return the value of cloud_resource_rela.create_time
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_resource_rela.create_time
     *
     * @param createTime the value for cloud_resource_rela.create_time
     *
     * @mbg.generated Thu Jun 29 05:02:23 CST 2023
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
