package com.github.xiaoyuge5201;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("weixin.url")
public class WeiXinUrlProperties {
    /**
     * 微信oauth认证地址
     */
    private String oauth = "https://open.weixin.qq.com/connect/oauth2/authorize";
    /**
     * pc端 通过扫码登陆
     * oauth认证地址
     */
    private String oauth_pc = "https://open.weixin.qq.com/connect/qrconnect";
    /**
     * 获取微信用户信息
     */
    private String user_info = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=";
    /**
     * 获取素材
     */
    private String material = "https://api.weixin.qq.com/cgi-bin/material/get_material";
    /**
     * 请求获取sjapi_ticket地址
     * sjapi_ticket是微信页面引入js时，签名所需要的参数之一
     */
    private String jsapi_ticket = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?type=jsapi&access_token=";
    /**
     * 微信获取accessToken
     * 这个要与oauth中accessToken区分
     */
    private String access_token_url = "https://api.weixin.qq.com/cgi-bin/token";
    /**
     * 微信统一下单接口地址
     * 发起微信支付请求地址
     */
    private String pay = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    /**
     * 微信获取access_token地址
     * 该地址是为微信oauth认证调用地址
     */
    private String oauth_token = "https://api.weixin.qq.com/sns/oauth2/access_token";
    /**
     * 微信oauth获取用户信息地址
     * 获取用户详细信息接口
     */
    private String oauth_user_info = "https://api.weixin.qq.com/sns/userinfo";
    /**
     * 微信创建公众号菜单地址
     * 创建公众号底部菜单url
     */
    private String menu = "https://api.weixin.qq.com/cgi-bin/menu/create";
    /**
     * 删除公众号菜单url
     */
    private String delete_menu = "https://api.weixin.qq.com/cgi-bin/menu/delete";
    /**
     * 微信自动回复地址
     * 关注微信公众号自动回复消息
     */
    private String auto_reply = "https://api.weixin.qq.com/cgi-bin/get_current_autoreply_info";
    /**
     * 微信模板消息接口
     */
    private String template_message = "https://api.weixin.qq.com/cgi-bin/message/template/send";
    /**
     * 创建用户标签
     */
    private String create_tags = "https://api.weixin.qq.com/cgi-bin/tags/create";
    /**
     * 批量为用户打标签
     */
    private String batch_tags = "https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging";

    private String get_tags = "https://api.weixin.qq.com/cgi-bin/tags/get";

    /**
     * 创建个性化菜单
     */
    private String addconditional_menu = "https://api.weixin.qq.com/cgi-bin/menu/addconditional";
    /**
     * 微信设置行业信息
     */
    private String set_industry = "https://api.weixin.qq.com/cgi-bin/template/api_set_industry";
    /**
     * 微信删除标签
     */
    private String delete_tags = "https://api.weixin.qq.com/cgi-bin/tags/delete";
    /**
     * 更新微信标签
     */
    private String update_tags = "https://api.weixin.qq.com/cgi-bin/tags/update";
    /**
     * 换取公众号、支付账号、外网服务器地址、域名不需要更换的内容--结束
     */
    private String get_media = "https://api.weixin.qq.com/cgi-bin/media/get";
    /**
     * 上传临时素材
     */
    private String upload_media = "https://api.weixin.qq.com/cgi-bin/media/upload";
    /**
     * 上传永久图文素材
     */
    private String add_news = "https://api.weixin.qq.com/cgi-bin/material/add_news";
    /**
     * 上传图文消息图片
     */
    private String media_image = "https://api.weixin.qq.com/cgi-bin/media/uploadimg";
    /**
     * 新增永久素材
     */
    private String add_material = "https://api.weixin.qq.com/cgi-bin/material/add_material";
    /**
     * 删除永久素材
     */
    private String del_material = "https://api.weixin.qq.com/cgi-bin/material/del_material";
    /**
     * 获取用户增减量
     */
    private String getusersummary = "https://api.weixin.qq.com/datacube/getusersummary";
    /**
     * 获取累计用户数据
     */
    private String getusercumhlate = "https://api.weixin.qq.com/datacube/getusercumulate";
    /**
     * 获取消息发送概况数据
     */
    private String getupstreammsg = "https://api.weixin.qq.com/datacube/getupstreammsg";
    /**
     * 获取消息发送 分时数据
     */
    private String getupstreammsghour = "https://api.weixin.qq.com/datacube/getupstreammsghour";
    /**
     * 获取消息发送  周数据
     */
    private String getupstreammsgweek = "https://api.weixin.qq.com/datacube/getupstreammsgweek";
    /**
     * 获取消息发送 月数据
     */
    private String getupstreammsgmonth = "https://api.weixin.qq.com/datacube/getupstreammsgmonth";
    /**
     * 获取消息发送分布数据
     */
    private String getupstreammsgdist = "https://api.weixin.qq.com/datacube/getupstreammsgdist";
    /**
     * 获取消息发送分布 周数据
     */
    private String getupstreammsgdistweek = "https://api.weixin.qq.com/datacube/getupstreammsgdistweek";
    /**
     * 获取消息发送分布  月数据
     */
    private String getupstreammsgdistmonth = "https://api.weixin.qq.com/datacube/getupstreammsgdistmonth";
    /**
     * 查询永久素材列表
     */
    private String batchget_material = "https://api.weixin.qq.com/cgi-bin/material/batchget_material";
    /**
     * 新增缩略图
     */
    private String media = "http://file.api.weixin.qq.com/cgi-bin/media/upload";
    /**
     * 根据openID群发图文消息
     */
    private String send_mass = "https://api.weixin.qq.com/cgi-bin/message/mass/send";

    private String add_template = "https://api.weixin.qq.com/cgi-bin/template/api_add_template";

    /**
     * 客服发送信息接口
     */
    private String custom_send = "https://api.weixin.qq.com/cgi-bin/message/custom/send";

    /**
     * 拉黑用户接口
     */
    private String add_blacklist = "https://api.weixin.qq.com/cgi-bin/tags/members/batchblacklist";

    /**
     * 移除黑名单接口
     */
    private String remover_blacklist = "https://api.weixin.qq.com/cgi-bin/tags/members/batchunblacklist";

    /**
     * 查看黑名单列表
     */
    private String get_blacklist = "https://api.weixin.qq.com/cgi-bin/tags/members/getblacklist";

    /**
     * 上传微信图文素材
     */
    private String upload_news = "https://api.weixin.qq.com/cgi-bin/media/uploadnews";
    /**
     * 群发微信图文消息
     */
    private String send_all = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall";
    /**
     * 微信图文预览接口
     */
    private String preview = "https://api.weixin.qq.com/cgi-bin/message/mass/preview";
    /**
     * 企业号获取accesstoken
     */
    private String qy_oauth_token_url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken";
    /**
     * redis中存储的微信token信息
     */
    private String qy_access_token = "qy_access_token";
    /**
     * 过期时间（设置小一点） 原大小为  6000s
     */
    private int qy_token_expires_in = 6000;
    /**
     * 获取部门列表信息
     */
    private String qy_department_list = "https://qyapi.weixin.qq.com/cgi-bin/department/list";
    /**
     * 读取成员信息
     */
    private String qy_user_info = "https://qyapi.weixin.qq.com/cgi-bin/user/get";

    /**
     * 企业成员推送消息
     */
    private String qy_send_msg = "https://qyapi.weixin.qq.com/cgi-bin/message/send";

    /**
     * 企业微信创建菜单
     */
    private String qy_menu_url = "https://qyapi.weixin.qq.com/cgi-bin/menu/create";

    /**
     * 删除企业号菜单url
     */
    private String qy_deletemenu_url = "https://qyapi.weixin.qq.com/cgi-bin/menu/delete";

    public String getOauth() {
        return oauth;
    }

    public void setOauth(String oauth) {
        this.oauth = oauth;
    }

    public String getOauth_pc() {
        return oauth_pc;
    }

    public void setOauth_pc(String oauth_pc) {
        this.oauth_pc = oauth_pc;
    }

    public String getUser_info() {
        return user_info;
    }

    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getJsapi_ticket() {
        return jsapi_ticket;
    }

    public void setJsapi_ticket(String jsapi_ticket) {
        this.jsapi_ticket = jsapi_ticket;
    }

    public String getAccess_token_url() {
        return access_token_url;
    }

    public void setAccess_token_url(String access_token_url) {
        this.access_token_url = access_token_url;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getOauth_token() {
        return oauth_token;
    }

    public void setOauth_token(String oauth_token) {
        this.oauth_token = oauth_token;
    }

    public String getOauth_user_info() {
        return oauth_user_info;
    }

    public void setOauth_user_info(String oauth_user_info) {
        this.oauth_user_info = oauth_user_info;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getDelete_menu() {
        return delete_menu;
    }

    public void setDelete_menu(String delete_menu) {
        this.delete_menu = delete_menu;
    }

    public String getAuto_reply() {
        return auto_reply;
    }

    public void setAuto_reply(String auto_reply) {
        this.auto_reply = auto_reply;
    }

    public String getTemplate_message() {
        return template_message;
    }

    public void setTemplate_message(String template_message) {
        this.template_message = template_message;
    }

    public String getCreate_tags() {
        return create_tags;
    }

    public void setCreate_tags(String create_tags) {
        this.create_tags = create_tags;
    }

    public String getBatch_tags() {
        return batch_tags;
    }

    public void setBatch_tags(String batch_tags) {
        this.batch_tags = batch_tags;
    }

    public String getGet_tags() {
        return get_tags;
    }

    public void setGet_tags(String get_tags) {
        this.get_tags = get_tags;
    }

    public String getAddconditional_menu() {
        return addconditional_menu;
    }

    public void setAddconditional_menu(String addconditional_menu) {
        this.addconditional_menu = addconditional_menu;
    }

    public String getSet_industry() {
        return set_industry;
    }

    public void setSet_industry(String set_industry) {
        this.set_industry = set_industry;
    }

    public String getDelete_tags() {
        return delete_tags;
    }

    public void setDelete_tags(String delete_tags) {
        this.delete_tags = delete_tags;
    }

    public String getUpdate_tags() {
        return update_tags;
    }

    public void setUpdate_tags(String update_tags) {
        this.update_tags = update_tags;
    }

    public String getGet_media() {
        return get_media;
    }

    public void setGet_media(String get_media) {
        this.get_media = get_media;
    }

    public String getUpload_media() {
        return upload_media;
    }

    public void setUpload_media(String upload_media) {
        this.upload_media = upload_media;
    }

    public String getAdd_news() {
        return add_news;
    }

    public void setAdd_news(String add_news) {
        this.add_news = add_news;
    }

    public String getMedia_image() {
        return media_image;
    }

    public void setMedia_image(String media_image) {
        this.media_image = media_image;
    }

    public String getAdd_material() {
        return add_material;
    }

    public void setAdd_material(String add_material) {
        this.add_material = add_material;
    }

    public String getDel_material() {
        return del_material;
    }

    public void setDel_material(String del_material) {
        this.del_material = del_material;
    }

    public String getGetusersummary() {
        return getusersummary;
    }

    public void setGetusersummary(String getusersummary) {
        this.getusersummary = getusersummary;
    }

    public String getGetusercumhlate() {
        return getusercumhlate;
    }

    public void setGetusercumhlate(String getusercumhlate) {
        this.getusercumhlate = getusercumhlate;
    }

    public String getGetupstreammsg() {
        return getupstreammsg;
    }

    public void setGetupstreammsg(String getupstreammsg) {
        this.getupstreammsg = getupstreammsg;
    }

    public String getGetupstreammsghour() {
        return getupstreammsghour;
    }

    public void setGetupstreammsghour(String getupstreammsghour) {
        this.getupstreammsghour = getupstreammsghour;
    }

    public String getGetupstreammsgweek() {
        return getupstreammsgweek;
    }

    public void setGetupstreammsgweek(String getupstreammsgweek) {
        this.getupstreammsgweek = getupstreammsgweek;
    }

    public String getGetupstreammsgmonth() {
        return getupstreammsgmonth;
    }

    public void setGetupstreammsgmonth(String getupstreammsgmonth) {
        this.getupstreammsgmonth = getupstreammsgmonth;
    }

    public String getGetupstreammsgdist() {
        return getupstreammsgdist;
    }

    public void setGetupstreammsgdist(String getupstreammsgdist) {
        this.getupstreammsgdist = getupstreammsgdist;
    }

    public String getGetupstreammsgdistweek() {
        return getupstreammsgdistweek;
    }

    public void setGetupstreammsgdistweek(String getupstreammsgdistweek) {
        this.getupstreammsgdistweek = getupstreammsgdistweek;
    }

    public String getGetupstreammsgdistmonth() {
        return getupstreammsgdistmonth;
    }

    public void setGetupstreammsgdistmonth(String getupstreammsgdistmonth) {
        this.getupstreammsgdistmonth = getupstreammsgdistmonth;
    }

    public String getBatchget_material() {
        return batchget_material;
    }

    public void setBatchget_material(String batchget_material) {
        this.batchget_material = batchget_material;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getSend_mass() {
        return send_mass;
    }

    public void setSend_mass(String send_mass) {
        this.send_mass = send_mass;
    }

    public String getAdd_template() {
        return add_template;
    }

    public void setAdd_template(String add_template) {
        this.add_template = add_template;
    }

    public String getCustom_send() {
        return custom_send;
    }

    public void setCustom_send(String custom_send) {
        this.custom_send = custom_send;
    }

    public String getAdd_blacklist() {
        return add_blacklist;
    }

    public void setAdd_blacklist(String add_blacklist) {
        this.add_blacklist = add_blacklist;
    }

    public String getRemover_blacklist() {
        return remover_blacklist;
    }

    public void setRemover_blacklist(String remover_blacklist) {
        this.remover_blacklist = remover_blacklist;
    }

    public String getGet_blacklist() {
        return get_blacklist;
    }

    public void setGet_blacklist(String get_blacklist) {
        this.get_blacklist = get_blacklist;
    }

    public String getUpload_news() {
        return upload_news;
    }

    public void setUpload_news(String upload_news) {
        this.upload_news = upload_news;
    }

    public String getSend_all() {
        return send_all;
    }

    public void setSend_all(String send_all) {
        this.send_all = send_all;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getQy_oauth_token_url() {
        return qy_oauth_token_url;
    }

    public void setQy_oauth_token_url(String qy_oauth_token_url) {
        this.qy_oauth_token_url = qy_oauth_token_url;
    }

    public String getQy_access_token() {
        return qy_access_token;
    }

    public void setQy_access_token(String qy_access_token) {
        this.qy_access_token = qy_access_token;
    }

    public int getQy_token_expires_in() {
        return qy_token_expires_in;
    }

    public void setQy_token_expires_in(int qy_token_expires_in) {
        this.qy_token_expires_in = qy_token_expires_in;
    }

    public String getQy_department_list() {
        return qy_department_list;
    }

    public void setQy_department_list(String qy_department_list) {
        this.qy_department_list = qy_department_list;
    }

    public String getQy_user_info() {
        return qy_user_info;
    }

    public void setQy_user_info(String qy_user_info) {
        this.qy_user_info = qy_user_info;
    }

    public String getQy_send_msg() {
        return qy_send_msg;
    }

    public void setQy_send_msg(String qy_send_msg) {
        this.qy_send_msg = qy_send_msg;
    }

    public String getQy_menu_url() {
        return qy_menu_url;
    }

    public void setQy_menu_url(String qy_menu_url) {
        this.qy_menu_url = qy_menu_url;
    }

    public String getQy_deletemenu_url() {
        return qy_deletemenu_url;
    }

    public void setQy_deletemenu_url(String qy_deletemenu_url) {
        this.qy_deletemenu_url = qy_deletemenu_url;
    }
}
