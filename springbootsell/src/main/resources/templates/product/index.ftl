<html>
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">
    <#include "../common/nav.ftl">
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form role="form"  method="post" action="/seller/product/save">
                        <div class="form-group">
                            <label for="exampleInputEmail1">商品名称</label>
                            <input name="productName" type="text" class="form-control" value="${(productInfo.productName)!''}">
                        </div>

                        <div class="form-group">
                            <label for="exampleInputEmail1">价格</label>
                            <input name="productPrice" type="text" class="form-control" value="${(productInfo.productPrice)!''}">
                        </div>

                        <div class="form-group">
                            <label for="exampleInputEmail1">库存</label>
                            <input name="productStock" type="text" class="form-control" value="${(productInfo.productStock)!''}">
                        </div>

                        <div class="form-group">
                            <label for="exampleInputEmail1">商品描述</label>
                            <input name="productDescription" type="text" class="form-control" value="${(productInfo.productDescription)!''}">
                        </div>

                        <div class="form-group">
                            <label for="exampleInputEmail1">商品图片</label>
                            <img width="100" height="100" src="${(productInfo.productIcon)!''}" alt="">
                            <input name="productIcon" type="text" class="form-control" value="${(productInfo.productIcon)!''}">
                        </div>

                        <div class="form-group">
                            <label for="exampleInputEmail1">类目</label>
                            <select name="categoryType" class="form-group">
                               <#list categoryList as category>
                                   <option value="${category.categoryType}"
                                   <#if (productInfo.categoryType)?? && productInfo.categoryType==category.categoryType>
                                       selected
                                   </#if>
                                   >${category.categoryName}</option>
                               </#list>

                            </select>
                        </div>

                        <input hidden type="text" name="productId" value="${(productInfo.productId)!''}">
                        <button type="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>